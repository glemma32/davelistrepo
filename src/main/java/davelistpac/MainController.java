package davelistpac;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import davelistpac.Rooms;
import davelistpac.RoomsRepository;

@Controller
public class MainController {
	
	@Autowired
	private RoomsRepository roomsRepository;
	
	@GetMapping("/new")
	public String addNewRoom(Model roomModel){
		roomModel.addAttribute("room", new Rooms());
		return "add";
	}
	
	@PostMapping("/new")
	public String roomAdded(@ModelAttribute Rooms room){
		roomsRepository.save(room);
		return "display";
	}

}
