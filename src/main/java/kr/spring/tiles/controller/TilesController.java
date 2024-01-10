package kr.spring.tiles.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TilesController {
	@RequestMapping("/")
	public String init() {
		return "redirect:/main.do";
	}
	
	@RequestMapping("/main.do")
	public String viewMain() {
		
		return "main";	//타일스 설정명					//layout.jsp를 호출하려 하기 떄문에 main.do가 아닌 main(tiles설정)
	}
	
	@RequestMapping("/company.do")
	public String viewCompany() {
		
		return "company";
	}
	
	@RequestMapping("/product.do")
	public String viewProduct() {
		
		return "product";
	}
}


//tiles 설정하면 먼저 실행