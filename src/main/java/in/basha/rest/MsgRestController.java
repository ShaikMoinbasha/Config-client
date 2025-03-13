package in.basha.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@Value("${message}")
	private String msgsssss;
	
	@GetMapping("/msg")
	public String getMsg() {
		return msgsssss;
	}

}
