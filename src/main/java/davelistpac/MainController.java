package davelistpac;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import davelistpac.Rooms;
import davelistpac.RoomsRepository;

@Controller
public class MainController {
	
	@Autowired
	private RoomsRepository roomsRepository;
	
	@RequestMapping("/login")
    public String newLogin(){
        return "login";

	}
	
	@GetMapping("/new")
	public String addNewRoom(Model roomModel){
		roomModel.addAttribute("room", new Rooms());
		return "add";
	}
	
	@PostMapping("/new")
	public String roomAdded(@Valid @ModelAttribute("room") Rooms room, BindingResult bindingResult){
		
		if(bindingResult.hasErrors()){
			return "add";
		}
		
		else{
		roomsRepository.save(room);
		return "display";
		}
	}
	@GetMapping("/list")
	public String displayLists(@ModelAttribute("room")Rooms room,Model roomListModel){
	 Iterable<Rooms> roomList = roomsRepository.findAll();
	 roomListModel.addAttribute("roomList", roomList);
	 return "list";
	}
	
	@PostMapping("/select")
	public String selectedRoom(@ModelAttribute("roomList")Rooms roomList, Long id){
		System.out.println(id);
		roomsRepository.findOne(id);
		return "select";
	}
	
	@RequestMapping("/update/{id}")
	public String updateStatus(@PathVariable("id") Long id, Model roomModel){
		Rooms room = new Rooms();
		room = roomsRepository.findOne(id);
		roomModel.addAttribute("room", room);
		return "add";
		
	}
		
	}
	
	


