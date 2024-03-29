package com.sangamone.pkg1;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
@RestController
public class FloodReliefController {
	@PostMapping("/emp/register")//CSRao will register in Portal. Response. KARCSR00042 will be alloted
	public String register(@RequestBody FloodReliefModelEmp frme) {
		return "KARCSR00042";
	}
	
	@PostMapping("/emp/contribute")//CSRao will contribute Rs 500. Response - PaymentId 12345678 created for KARCSR00042
	public int contribute(@RequestBody FloodReliefModelContribution frmc) {
		return 12345678;
	}
	
	@GetMapping("/emp/get/date/{dt1}")
	public List<FloodReliefModelEmp> getEmployeesByDate(@PathVariable LocalDate dt1){
		List<FloodReliefModelEmp>list1=new ArrayList<>();
		return list1;
	}
	@GetMapping("/emp/get/state/{state1}/{dt1}")
	public List<FloodReliefModelEmp> getEmployeesByState(@PathVariable String state1, @PathVariable LocalDate dt1){
		List<FloodReliefModelEmp>list1=new ArrayList<>();
		return list1;
	}
	
	
}
