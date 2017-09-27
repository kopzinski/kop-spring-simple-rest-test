package br.com.kopzinski;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

	@RequestMapping(path = "/echo/{message}", method= RequestMethod.GET)
	public Message echo(@PathVariable("message") String message) {
		return new Message(message);
	}
	
}
