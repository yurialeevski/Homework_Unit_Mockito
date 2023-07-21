package ru.skypro.homework.springdatajpa.service;


import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl  {
    //private final EmployeeRepository employeeRepository;

    //public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
    //    this.employeeRepository = employeeRepository;
    //}




    /*
    @Override
    public Collection<Employee> findAllEmployees() {

        return employeeRepository.findAll();
    }
        @Override
    public void addEmployee(Employee employee) {
        employeeRepository.save(employee);
    }
    @Override
    public Employee findEmployeeById(Integer id) {
        Optional<Employee> employeeOptional = employeeRepository.findById(id);
        return employeeOptional.orElseThrow(() -> new IncorrectEmployeeIdException("id: " + id));
    }
    @Override
    public void deleteEmployeeById(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findByName(String name) {
        return employeeRepository.findByName(name);
    }

    @Override
    public List<Employee> findBySalaryGreaterThan(int salary) {
        return employeeRepository.findBySalaryGreaterThan(salary);
    }



    @Override
    public List<Employee> findWithGreatestSalary() {
        return employeeRepository.findWithGreatestSalary();
    }

    @Override
    public List<EmployeeDTO> showAllEmployeesDTO() {
        List<Employee> employeeList = new ArrayList<>(employeeRepository.showAllEmployees());
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        for(Employee employee: employeeList) {
            EmployeeDTO employeeDTO = EmployeeDTO.fromEmployee(employee);
            employeeDTOList.add(employeeDTO);
        }
        return employeeDTOList;
    }
    public List<EmployeeDTO> findAllEmployeesDTO() {
        //List<Employee> employeeList = new ArrayList<>();
        Iterable<Employee> employeeIterable = employeeRepository.findAll();
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        for(Employee employee: employeeIterable) {
            EmployeeDTO employeeDTO = EmployeeDTO.fromEmployee(employee);
            employeeDTOList.add(employeeDTO);
        }
        return employeeDTOList;
    }

    @Override
    public List<EmployeeDTO> findWithGreatestSalaryDTO() {
        List<Employee> employeeList = new ArrayList<>(employeeRepository.findWithGreatestSalary());
        List<EmployeeDTO> employeeDTOList = new ArrayList<>();
        for(Employee employee: employeeList) {
            EmployeeDTO employeeDTO = EmployeeDTO.fromEmployee(employee);
            employeeDTOList.add(employeeDTO);
        }
        return employeeDTOList;
    }

    @Override
    public int getSumEmployeeSalary() {
        return employeeRepository.getSumSalary();
    }
    @Override
    public int getMinEmployeeSalary() {
        return employeeRepository.getMinSalary();
    }
    @Override
    public int getMaxEmployeeSalary() {
        return employeeRepository.getMaxSalary();
    }
    @Override
    public List<Employee> getHighSalaryEmployees() {
        return employeeRepository.getHighSalary();
    }

    @Override
    public List<Employee> getHigherThanSalaryEmployees(Integer salary) {
        return employeeRepository.getHigherThanSalary(salary);
    }

    @Override
    public void updateEmployeeById(Integer id, Employee employee) {
        employeeRepository.updateById(id, employee);
    }


    @Override
    public void addListOfEmployees(List<Employee> employees) {
        employeeRepository.addListOf(employees);
    }





 */
}
