package com.app.control;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.ServletContextAware;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.app.dao.IEmployeeDao;
import com.app.model.Employee;
import com.app.util.ConnectionUtil;
@Controller
public class HomeControl implements ServletContextAware{
	@Autowired
	private IEmployeeDao dao;
	@Autowired
	private ConnectionUtil connectionUtil;
	//@Autowired
	private ServletContext servletContext;
	List<Employee> eList=null;
	@RequestMapping("/home")
	public ModelAndView show(){
		return new ModelAndView("home");
	}
	
/*	@RequestMapping("/checkeid")
	public @ResponseBody String idcheck(@RequestParam("input")String ename){
		int eid=Integer.parseInt(ename);
		List<Employee> eList=dao.getAllEmps();
		String msg=eid+" is available";
		for(Employee e:eList){
			if(e.getEid()==(eid))
				msg=eid+" is not available";
		}
		return msg;
	}*/

	@RequestMapping("/checkeid")
	public @ResponseBody String nacheck(@RequestParam("input")String eid){
		int id=Integer.parseInt(eid);
		List<Employee> eList=dao.getAllEmps();
		String msg=eid+" is available";
		for(Employee e:eList){
			if(e.getEid()==(id))
				msg=eid+" is not available try with new eid";
		}
		return msg;
	}
	
	
	@RequestMapping("/checkname")
	public @ResponseBody String namecheck(@RequestParam("input")String ename){
		eList=dao.getAllEmps();
		String msg=ename+" is available";
		for(Employee e:eList){
			if(e.getEname().equals(ename))
				msg=ename+" name is not available";
		}
		return msg;
	}
	@RequestMapping("/ajaxCall")
	public @ResponseBody String provideResponse(@RequestParam("input")String input){
		return input+" "+Math.random()*10000;
	}
	@RequestMapping(name="/insert",method=RequestMethod.POST)
	public ModelAndView insert(@ModelAttribute("employee")Employee emp,
					@RequestParam("file")MultipartFile file,
					HttpServletRequest request) throws IOException{
		emp.setImage1(file.getBytes());	
		emp.setFname(servletContext.getRealPath("/"));
		//emp.setFname(file.getOriginalFilename());
		dao.insertEmp(emp);
		ModelAndView mav=new ModelAndView("home");
/*		mav.setViewName("home");
*/		mav.addObject("emp", emp);
		mav.addObject("name", "suresh");
		
		// saving file in local area of project
		//String path1=servletContext.getRealPath("/resources/files/");
		//String path2=servletContext.getContextPath();
		//String path1=path2+"/resources/files/";
		//String path1=servletContext.getContextPath();
		//String path1=servletContext.getContextPath()+"/src/main/webapp/resources/files/";
		//+"/resources/files/";
		//Set<String> paths=servletContext.getResourcePaths("/");
		String path1=servletContext.getRealPath("/");
		/*if(!new File(path1).exists())
			new File(path1).mkdirs();*/
		File path=new File(path1+file.getOriginalFilename());

		
		//ObjectMapper om=new ObjectMapper();
		
		
//		if(!path.exists())
//			path.mkdirs();
//		
		if(!path.exists())
			path.createNewFile();
		//File saveFile=new File(file.getOriginalFilename());
		FileOutputStream fos=new FileOutputStream(path);
		fos.write(file.getBytes());
		fos.close();
		connectionUtil.sendMail("suresheragana@gmail.com", "pora rey", "rara rey", file);
		return mav;
		//return new ModelAndView("home");
	}
/*	@RequestMapping("/home")
	public ModelAndView insertGet(){
		ModelAndView mav=new ModelAndView("home");
		mav.addObject("eList",eList);
		mav.addObject("name", "suresh");
		return mav;
	}*/

    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;

    }

    public String getContextPath(){
    return servletContext.getContextPath();
   }
}
