package com.example.demo.config;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.demo.model.Automation;
import com.example.demo.model.Commands;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {

	private static final Logger LOG = LoggerFactory.getLogger(Demo.class);

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {

		String path = "test.json";

		ObjectMapper mapper = new ObjectMapper();
		Automation automation = new Automation();

		try (PrintStream ps = new PrintStream(new FileOutputStream(new File("result.properties")));) {
			automation = mapper.readValue(new File(path), Automation.class);
			List<Commands> commands = automation.getTests().get(0).getCommands();
			Iterator<Commands> itr = commands.listIterator();
			while (itr.hasNext()) {
				Commands command = itr.next();
				if (command.getTargets().size() >= 4) {
					ps.print(command.getCommand() + "=" + command.getTargets().get(3) + "\n");

				} else if (command.getTargets().size() > 0) {
					ps.print(command.getCommand() + "=" + command.getTargets().get(1) + "\n");
				}
			}
			LOG.info("please check the output generated file....");
		} catch (IOException e) {
			e.printStackTrace();
			LOG.error("Pipe is broken some where " + e.getMessage());
		}

		/*
		 * try { automation = mapper.readValue(new File(path), Automation.class);
		 * List<Commands> commands = automation.getTests().get(0).getCommands();
		 * commands.forEach((command) -> { String s = ""; if
		 * (command.getTargets().size() > 0) s = command.getCommand() + "=" +
		 * command.getTargets().get(3); //
		 * System.out.println(command.getCommand()+"="+command.getTargets().get(3)); try
		 * (PrintStream ps = new PrintStream(new FileOutputStream(new
		 * File("result.properties")));) { ps.print(s); } catch (FileNotFoundException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); } catch
		 * (IOException e1) { // TODO Auto-generated catch block e1.printStackTrace(); }
		 * });
		 * 
		 * } catch (IOException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 */
		/*
		 * 
		 * mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
		 * 
		 * try { List<String> automation = mapper.readValue(new File(
		 * "C:\\Users\\141418\\hitachi-workspace\\SpringBoot00\\src\\main\\resources\\test.json"
		 * ), new TypeReference<List<String>>(){}); } catch (IOException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
	}
}
