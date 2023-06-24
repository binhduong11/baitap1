
package baitap1;

import java.util.List;


public interface IVisitor {
     void VisitExperience(Experience experience, List<Employee> x);
     void VisitFresher(Fresher fresher,List<Employee> x);
     void VisitInter(Inter inter,List<Employee> x);

    
}
