package com.github.bragagustavo.restfulcrud.dao;

import com.github.bragagustavo.restfulcrud.model.Empregado;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

public class EmpregadoDAO {

    public static final Map<String, Empregado> empMap = new HashMap <String, Empregado>();

    static{
        initEmps();
    }

    private static void initEmps(){

        Empregado emp1 = new Empregado("E01", "João", "Silva");
        Empregado emp2 = new Empregado("E02", "Carlos", "Batista");
        Empregado emp3 = new Empregado("E02", "Isadora", "Pinto");

        empMap.put(emp1.getEmpNo(), emp1);
        empMap.put(emp2.getEmpNo(), emp2);
        empMap.put(emp3.getEmpNo(), emp3);
    }

    public static Empregado getEmpregado (String empNo){
        return empMap.get(empNo);
    }

    public static Empregado addEmpregado(Empregado emp){
        empMap.put(emp.getEmpNo(), emp);
        return emp;
    }

    public static Empregado updateEmpregado(Empregado emp){
        empMap.put(emp.getEmpNo(), emp);
        return emp;
    }

    public static void deleteEMpregado(String empNo){
        empMap.remove(empNo);
    }

    public static List<Empregado> getAllEmpregados(){
        Collection<Empregado> c = empMap.values();
        List<Empregado>list = new ArrayList<Empregado>();
        list.addAll(c);
        return list;
    }
}
