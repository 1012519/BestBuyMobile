package mobileshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DangNhapController {
	
	@RequestMapping(value="dangnhap")
	public String dangnhap (){
		return "DangNhap";
	}
}
