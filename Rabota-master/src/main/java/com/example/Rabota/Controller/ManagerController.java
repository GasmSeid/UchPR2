package com.example.Rabota.Controller;
import com.example.Rabota.Models.Manager;
import com.example.Rabota.repo.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class ManagerController {
    @Autowired
    private ManagerRepository managerRepository;
    @GetMapping("/Manager")
    public String GetRab(Model model)
    {
        Iterable<Manager> manager = managerRepository.findAll();
        model.addAttribute("Manager", manager);
        return "MainManager";
    }
    @GetMapping("/Add/Manager")
    public String GetAddStudent(Model model)
    {
        return "Add-Manager";
    }
    @PostMapping("/Add/Manager")
    public String blogPostAdd(@RequestParam(value="surname") String surname,
                              @RequestParam(value ="name" ) String name,
                              @RequestParam(value = "middlename") String middlename,
                              @RequestParam(value ="bthday" ) String bthday,
                              @RequestParam(value = "SeriaPass") int SeriaPass,
                              @RequestParam(value = "NomPass") int NomPass,
                              @RequestParam(value = "AdresReg") String AdresReg,
                              @RequestParam(value = "Email") String Email,
                              Model model)
    {
        Manager manager = new Manager(surname, name, middlename, bthday, SeriaPass, NomPass, AdresReg, Email);
        managerRepository.save(manager);
        return "redirect:/Manager";
    }
    @GetMapping( path = "/Search/Manager")
    public String blogFilter(Model model)
    {
        return "Search-Manager";
    }

    @PostMapping("/Search/Manager-result")
    public String blogResult(@RequestParam String surname, Model model)
    {
        List<Manager> teach = managerRepository.findBySurname(surname);
        model.addAttribute("result", teach);
        return "Search-Manager";
    }
    @PostMapping("/Search/Manager")
    public String simpleSearch(@RequestParam String surname, Model model)
    {
        List<Manager> teach = managerRepository.findBySurnameContains(surname);
        model.addAttribute("result", teach);
        return "Search-Manager";
    }
}
