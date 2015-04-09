package controller;

import java.io.IOException;

import model.Address;
import model.HibernateUtil;
import model.Player;
import model.Sponsor;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.ObjectWriter;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PlayerController {
	@RequestMapping(value = "/createPlayer", method = RequestMethod.GET)
	public String toCreatePlayer() {
		System.out.println("in create player ");
		return "createPlayer";
	}
	
	@RequestMapping(value = "/homepage", method = RequestMethod.POST)
	public String addPlayer(@ModelAttribute("SpringWeb")Player newPlayer, Address newAddress, Sponsor newSponsor, ModelMap model) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		System.out.println("in addPlayer");
		
		Player player = new Player();
		Address address = new Address();
		//Sponsor sponsor = new Sponsor();
		
		player.setFirstname(newPlayer.getFirstname());
		player.setLastname(newPlayer.getLastname());
		player.setEmail(newPlayer.getEmail());
		player.setDescription(newPlayer.getDescription());
		address.setStreet(newAddress.getStreet());
		address.setCity(newAddress.getCity());
		address.setState(newAddress.getState());
		address.setZip(newAddress.getZip());
		System.out.println("first name: " + newPlayer.getFirstname());
		
		try {
			session.save(player);
			session.save(address);
		    session.getTransaction().commit();
		      
		    model.addAttribute("id", player.getId());
		    model.addAttribute("firstname", player.getFirstname());
		    model.addAttribute("lastname", player.getLastname());
		    model.addAttribute("email", player.getEmail());
		    model.addAttribute("description", player.getDescription());
		    model.addAttribute("street", address.getStreet());
		}catch(Exception e) {
	    	  e.printStackTrace();
	    }

		return "redirect:http://localhost:8080/cmpe275lab3/homepage/"+player.getFirstname();	
	}
}
		
		
//		 player = (Player)session.get(Player.class, firstname);
////		  model.addAttribute("id", player.getId());
//		  model.addAttribute("firstname", player.getFirstname());
//	      model.addAttribute("lastname", player.getLastname());
////	      model.addAttribute("email", player.getEmail());
////	      model.addAttribute("description", player.getDescription());
////	      model.addAttribute("street", address.getStreet());
////	      model.addAttribute("city", address.getCity());
////	      model.addAttribute("state", address.getState());
////	      model.addAttribute("zip", address.getZip());
////	      model.addAttribute("city", address.getCity());
////	      model.addAttribute("sponsorId", sponsor.getId());
////	      model.addAttribute("sponsorName", sponsor.getName());
////	      model.addAttribute("sponsorDescription", sponsor.getDescription());
////	      model.addAttribute("sponsorAddress", sponsor.getAddress());
//
//	      if(brief==true){
//				ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//				try {
//					String json = ow.writeValueAsString(player);
//					model.addAttribute("json",json);
//				} catch (JsonGenerationException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (JsonMappingException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				return "homepage";
//		   }
//	 }catch(NullPointerException e) {
//			
////	      if(player==null){
////				model.addAttribute("id",id);
////				return "404";
////	      }
//		 System.out.println("error!");
//	      e.printStackTrace();
//	 }
//
//	return "homepage";
//}
