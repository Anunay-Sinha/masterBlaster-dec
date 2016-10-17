package com.il.masterblaster.dataModule.core.controllers;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

/**
 * Created by [)/\ on 16/10/16.
 */

@RestController
@RequestMapping(value = "/base")
public class BaseController {

	@Value("${applicationName}")
	String applicationName;

	@ApiOperation(value = "Echo method from the server",
	response = String.class,
	notes = "Get call to get a echo message from the server.")
	@RequestMapping(value = "/echo", method = RequestMethod.GET)
	public ResponseEntity<String> echo() {
		String responseText = applicationName + " says howdy via docker123!!!!";
		return new ResponseEntity<String>(responseText,HttpStatus.OK);
	}
}
