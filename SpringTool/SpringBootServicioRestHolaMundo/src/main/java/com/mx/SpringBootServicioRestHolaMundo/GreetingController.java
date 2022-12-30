package com.mx.SpringBootServicioRestHolaMundo;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //para definir que este var ser un servicio rest
@RequestMapping(value="greeting")//para definir el path de nuestro endpoint
public class GreetingController {
	private final AtomicLong counter = new AtomicLong();
	private static final String template = "Hello %s";
	@GetMapping
	public Greeting greeting(@RequestParam(value="name",defaultValue = "World") String name) {
		return new Greeting(counter.incrementAndGet(),String.format(template, name));
	}

}
