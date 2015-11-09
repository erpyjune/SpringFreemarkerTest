package com.springapp.mvc.controller;

import com.springapp.mvc.dao.CopyKingMapper;
import com.springapp.mvc.data.BlogExtBodyData;
import com.springapp.mvc.data.ProductMainData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
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

        List<Map<String, Object>> blogExtList;
        List<ProductMainData> list = new ArrayList<ProductMainData>();

		// product_id, product_name, product_url, thumb_url, spec1, spec2, seed_url, category
		List<Map<String, Object>> mainDataAll = copyKingMapper.selectMainDataAll();
		for (Map<String, Object> history : mainDataAll) {
			ProductMainData productMainData = new ProductMainData();
			productMainData.setProductId((String)history.get("product_id"));
			productMainData.setProductName((String) history.get("product_name"));
			productMainData.setProductUrl((String) history.get("product_url"));
            productMainData.setThumbUrl((String) history.get("thumb_url"));
            productMainData.setSpec1((String) history.get("spec1"));
            productMainData.setSpec2((String) history.get("spec2"));
            productMainData.setSeedUrl((String) history.get("seed_url"));
            productMainData.setCategoryName((String) history.get("category"));

            /// get blog ext data
            blogExtList = copyKingMapper.selectBlogList(productMainData.getProductId());
            List<BlogExtBodyData> blogList = new ArrayList<BlogExtBodyData>();
            for (Map<String, Object> blogData : blogExtList) {
                BlogExtBodyData blogExtBodyData = new BlogExtBodyData();
                blogExtBodyData.setProductId(productMainData.getProductId());
                blogExtBodyData.setPostImageUrl((String)blogData.get("post_image_url"));
                blogExtBodyData.setPostTitle((String)blogData.get("post_title"));
                blogExtBodyData.setPostDesc((String) blogData.get("post_desc"));
                blogExtBodyData.setPostAuthor((String) blogData.get("post_author"));
                blogExtBodyData.setPostUrl((String) blogData.get("post_url"));
                blogList.add(blogExtBodyData);
            }

            productMainData.setBlogExtBodyList(blogList);
            list.add(productMainData);

			logger.info(productMainData.getProductName());
			logger.info(productMainData.getProductUrl());
			logger.info("==========================================");
		}

        model.addAttribute("productList", list);
		model.addAttribute("message", "Hello world!");

		return "hello";
	}
}