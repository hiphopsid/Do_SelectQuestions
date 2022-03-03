//import java.io.*;
//import java.util.*;
//import java.text.*;
//import java.math.*;
//import java.util.regex.*;
//
//
////JOB AGENCY
//class CompanyJobRepository
//{
//    static String getJobPrediction(int age, String highestQualification) throws NotEligibleException {
//        if(age<19)
//        {
//            throw new NotEligibleException("You are underage for any job");
//        }
//
//        if(age>=21 && highestQualification=="B.E")
//        {
//            return "We have openings for junior developer";
//        }
//        else if(age>=26 && highestQualification=="M.S" || highestQualification=="PhD")
//        {
//            return "We have openings for senior developer";
//        }
//        else
//        {
//            return "Sorry we have no openings for now";
//        }
//    }
//}
//
//public class Source {
//
//    String searchForJob(int age, String highestQualification) throws NotEligibleException {
//        if(age>=200 || age<=0)
//        {
//            throw new NotEligibleException("The age entered is not typical for a human being");
//        }
//
//        else
//        {
//           String str=CompanyJobRepository.getJobPrediction(age,highestQualification);
//           return  str;
//        }
//    }
//    public static void main(String args[] ) throws NotEligibleException {
//        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
//        Source s=new Source();
//        System.out.println(s.searchForJob(22,"B.E"));
//    }
//}
//class NotEligibleException extends Exception
//{
//    public NotEligibleException()
//    {
//
//    }
//
//    public NotEligibleException(String message) {
//        super(message);
//    }
//}