package in.onlydocs.controller;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
public class MainConroller {
	static Logger LOGGER = Logger.getLogger(MainConroller.class);
	
	@RequestMapping("/")
	public String getHomePage(Model model,@RequestParam("language") String language,HttpServletRequest request, HttpServletResponse response){
		
		LOGGER.info("First page is initializing ");
		Locale locale = LocaleContextHolder.getLocale();
		LocaleResolver localeResolver = RequestContextUtils.getLocaleResolver((HttpServletRequest) request);
		System.out.println("locale is"+locale.getDisplayLanguage());
		if("hi_IN".equalsIgnoreCase(language)) {
			localeResolver.setLocale((HttpServletRequest)request, (HttpServletResponse)response, new Locale("hi_IN"));
		}else {
			locale.setDefault(new Locale("en_US"));
		}
		/*
		 * try { List<GalleryBean> images = mainUIService.getSliderImages();
		 * model.addAttribute("images", images); } catch (SQLException e) {
		 * e.printStackTrace(); }
		 */
		return "index";		
	}	
}
