package ru.skypro.homework.springdatajpa.controller;

import org.springframework.web.bind.annotation.*;
import ru.skypro.homework.springdatajpa.dto.EmployeeDTO;
import ru.skypro.homework.springdatajpa.dto.EmployeeViewDTO;
import ru.skypro.homework.springdatajpa.model.Employee;
import ru.skypro.homework.springdatajpa.service.EmployeeService;
import ru.skypro.homework.springdatajpa.model.EmployeeView;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/salary/min")
    public int showMinEmployeeSalary() {
        return employeeService.getMinEmployeeSalary();
    }

    @GetMapping("/with-greatest-salary")
    public List<EmployeeDTO> getAllEmployeesWithMaxSalary() {
        return employeeService.getAllWithMaxSalary();
    }

    @GetMapping("/all-with-position")
    public List<EmployeeDTO> getAllEmployeesByPosition(@RequestParam("position") String position) {
        return employeeService.findAllWithPosition(position);
    }
    @GetMapping("/{id}/fullInfo")
    public EmployeeView getEmployeeFullInfoById(@PathVariable Integer id) {
        return employeeService.findFullInfoById(id);
    }
    @GetMapping({"/{id}/fullViewInfo"})
    public EmployeeViewDTO getViewInfoById(@PathVariable Integer id) {
        return employeeService.findViewInfo(id);
    }
    @GetMapping("/pages")
    public List<Employee> getAllEmployeesByPageNumber(
            @RequestParam(defaultValue = "0") Integer pageNo,
            @RequestParam(defaultValue = "10") Integer pageSize,
            @RequestParam(defaultValue = "employeeId") String sortBy) {
        List<Employee> list = employeeService.getAllByPageNumber(pageNo, pageSize, sortBy);

        return list;
    }
        /*@GetMapping("/get-employees")
    public List<Employee> getEmployees() {
        return employeeService.findAll();
    }
    @GetMapping("/{employeeId}")
    public ResponseEntity<Employee> getEmployeeById(@PathVariable Integer employeeId) {
        Employee employee = employeeService.getEmployeeById(employeeId);
        //EmployeeDTO employeeDTO = employeeService.getEmployeeById(employeeId);
        if (employee == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.ok(employee);
    }*/
    /*

    @PostMapping("/add-one-employee")
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Employee findEmployeeById(@PathVariable Integer id) {
        return employeeService.findEmployeeById(id);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteEmployeeById(@PathVariable Integer id) {
        employeeService.deleteEmployeeById(id);
    }
    @GetMapping("/find-by-name")
    public List<Employee> findByName(String name) {
        return employeeService.findByName(name);
    }
    @GetMapping("/salary-greater-than")
    public List<Employee> findBySalaryGreaterThan(int salary) {
        return employeeService.findBySalaryGreaterThan(salary);
    }

    @GetMapping("/greatest-salary-employees") public List<Employee> findWithGreatestSalary() {
        return employeeService.findWithGreatestSalary();
    }


    @GetMapping("/dto/show-all-employees")
    public List<EmployeeDTO> showAllEmployeesDTO() {
        return employeeService.showAllEmployeesDTO();
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void updateEmployeeById(@PathVariable Integer id, @RequestBody Employee employee) {
        employeeService.updateEmployeeById(id, employee);
    }

    @PostMapping("/")
    @ResponseStatus(HttpStatus.CREATED)
    public void addListOfEmployees(@RequestBody List<Employee> employees){
        employeeService.addListOfEmployees(employees);
    }


    @GetMapping("/salaryHigherThan")
    public List<Employee> showSalaryHigherThan(@RequestParam("salary") Integer salary) {
        return employeeService.getHigherThanSalaryEmployees(salary);
    }

    @GetMapping("/salary/sum")
    public int showSumEmployeeSalary() {
        return employeeService.getSumEmployeeSalary();
    }

    @GetMapping("/salary/max")
    public int showMaxEmployeeSalary() { return employeeService.getMaxEmployeeSalary();}
    @GetMapping("/high-salary")
    public List<Employee> showHighSalaryEmployees() { return employeeService.getHighSalaryEmployees();}

     */
}

