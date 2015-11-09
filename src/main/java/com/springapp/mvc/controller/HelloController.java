package com.springapp.mvc.controller;

import com.springapp.mvc.dao.CopyKingMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/")
public class HelloController {

	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	CopyKingMapper copyKingMapper;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

	@RequestMapping(value = "/get_data", method = RequestMethod.GET)
	public String getMain(ModelMap model) throws Exception {

		List<Map<String, Object>> mainDataAll = copyKingMapper.selectMainDataAll();
		for (Map<String, Object> history : mainDataAll) {
			String productName = (String) history.get("product_name");
			String productUrl = (String) history.get("product_url");

			logger.info(productName);
			logger.info(productUrl);
			logger.info("==========================================");
		}

		model.addAttribute("message", "Hello world!");

		return "hello";
	}
}