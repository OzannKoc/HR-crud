package com.ozan.department.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ozan.department.entity.ApplicationLog;
import com.ozan.department.services.DepartmentsService;

@Aspect
@Component
public class ApplicationLogAspect {
	@Autowired
	private DepartmentsService departmentsService ;
	
	@Pointcut("execution(*  searchAll(..))")
	public void allSearchs() {
		
	}
	
//	@Around("allSearchs()")
//	public Object beforeAllSearchs(ProceedingJoinPoint pjp) throws Throwable {
//		System.out.println("AROUND ASPECT ÇALIÞIYOR ÝNÞALLAH");
//		Object result = pjp.proceed();
//		Object[] dpt =pjp.getArgs();
//		for (Object object : dpt) {
//			System.out.print(object+" ");
//		}
//		System.out.println("\n");
//		System.out.println("ben class nameyim "+pjp.getSignature().toShortString());
//		
//		System.out.println("ben result to stringiyim "+result.toString());
//		
//		long begin = System.currentTimeMillis();
//		//ApplicationLog log = new ApplicationLog("com.ozan.dao.carcut","xxxsadasd","liste","50");
//		//departmentsService.setDbLog(log);
//		
//		
//		TimeUnit.SECONDS.sleep(3);
//		
//
//		long end = System.currentTimeMillis();
//		long interval = end-begin;
//		System.out.println(pjp.getSignature().toShortString()
//				+" " +interval+ " ms sürdü." );
//		return result;
//	}
	@Around("allSearchs()")
	public Object aroundAllSearchs(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("AROUND ");
		
		Long baslangic = System.currentTimeMillis();

		Object result = pjp.proceed();

		Long end = System.currentTimeMillis();

		Long sure = end - baslangic;

		String methodName = pjp.getSignature().toShortString();

		Long databaseSure = sure;

		String param = null;
		Object[] args = pjp.getArgs();
		for (Object object : args) {
			param+= object + " ";
			
		}
//		if(result.toString().length()>1900) {
//			result =result.toString().substring(0, 100);
//		}
		

		
		if(10<databaseSure)	{
		ApplicationLog applicatonLog = new ApplicationLog(methodName,param,result.toString(),databaseSure);
		departmentsService.setDbLog(applicatonLog);
		}
		
		

		

		return result;
	} 
	
	@Around("execution(* getDepartmentsList(..))")
	public Object aroundAllSearchFunctions(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("AROUND ");
		
		Long baslangic = System.currentTimeMillis();

		Object result = pjp.proceed();

		Long end = System.currentTimeMillis();

		Long sure = end - baslangic;

		String methodName = pjp.getSignature().toShortString();

		Long databaseSure = sure;

		String param = null;
		Object[] args = pjp.getArgs();
		for (Object object : args) {
			param+= object + " ";
			
		}
//		if(result.toString().length()>1900) {
//			result =result.toString().substring(0, 100);
//		}
		

		if(10<databaseSure)	{
			ApplicationLog applicatonLog = new ApplicationLog(methodName,param,result.toString(),databaseSure);
			departmentsService.setDbLog(applicatonLog);
			}
			
		
		
		

		

		return result;
	} 
	
	@Around("execution(* updateDepartments(..))")
	public Object aroundAllSaveFunctions(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("AROUND ");
		
		Long baslangic = System.currentTimeMillis();

		Object result = pjp.proceed();

		Long end = System.currentTimeMillis();

		Long sure = end - baslangic;

		String methodName = pjp.getSignature().toShortString();

		Long databaseSure = sure;

		String param = null;
		Object[] args = pjp.getArgs();
		for (Object object : args) {
			param+= object + " ";
			
		}
//		if(result.toString().length()>1900) {
//			result =result.toString().substring(0, 100);
//		}
		

		if(10<databaseSure)	{
			ApplicationLog applicatonLog = new ApplicationLog(methodName,param,result.toString(),databaseSure);
			departmentsService.setDbLog(applicatonLog);
			}
			
		
		
		

		

		return result;
	} 
	
	@Around("execution(* getEmployeesList(..))")
	public Object aroundAllgetDepartmentFunctions(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("AROUND ");
		
		Long baslangic = System.currentTimeMillis();

		Object result = pjp.proceed();

		Long end = System.currentTimeMillis();

		Long sure = end - baslangic;

		String methodName = pjp.getSignature().toShortString();

		Long databaseSure = sure;

		String param = null;
		Object[] args = pjp.getArgs();
		for (Object object : args) {
			param+= object + " ";
			
		}
//		if(result.toString().length()>1900) {
//			result =result.toString().substring(0, 100);
//		}
		

		if(10<databaseSure)	{
			ApplicationLog applicatonLog = new ApplicationLog(methodName,param,result.toString(),databaseSure);
			departmentsService.setDbLog(applicatonLog);
			}
			
		
		
		

		

		return result;
	} 
	
	@Around("execution(* updateEmployees(..))")
	public Object aroundAllgetEmployeeFunctions(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("AROUND ÇALIÞIYOR.");
		
		Long baslangic = System.currentTimeMillis();

		Object result = pjp.proceed();

		Long end = System.currentTimeMillis();

		Long sure = end - baslangic;

		String methodName = pjp.getSignature().toShortString();

		Long databaseSure = sure;

		String param = null;
		Object[] args = pjp.getArgs();
		for (Object object : args) {
			param+= object + " ";
			
		}
//		if(result.toString().length()>1900) {
//			result =result.toString().substring(0, 100);
//		}
		
		if(10<databaseSure)	{
			ApplicationLog applicatonLog = new ApplicationLog(methodName,param,result.toString(),databaseSure);
			departmentsService.setDbLog(applicatonLog);
			}
		
			
		
		
		

		

		return result;
	} 
	
	@Around("execution(* updateLocations(..))")
	public Object aroundAllgetLocationFunctions(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("AROUND ÇALIÞIYOR.");
		
		Long baslangic = System.currentTimeMillis();

		Object result = pjp.proceed();

		Long end = System.currentTimeMillis();

		Long sure = end - baslangic;

		String methodName = pjp.getSignature().toShortString();

		Long databaseSure = sure;

		String param = null;
		Object[] args = pjp.getArgs();
		for (Object object : args) {
			param+= object + " ";
			
		}
//		if(result.toString().length()>1900) {
//			result =result.toString().substring(0, 100);
//		}
		
		if(10<databaseSure)	{
			ApplicationLog applicatonLog = new ApplicationLog(methodName,param,result.toString(),databaseSure);
			departmentsService.setDbLog(applicatonLog);
			}
		
			
		
		
		

		

		return result;
	} 
	
	
	
	@Around("execution(* getLocationsList(..))")
	public Object aroundgetLocationsFunctions(ProceedingJoinPoint pjp) throws Throwable {

		System.out.println("AROUND ÇALIÞIYOR.");
		
		Long baslangic = System.currentTimeMillis();

		Object result = pjp.proceed();

		Long end = System.currentTimeMillis();

		Long sure = end - baslangic;

		String methodName = pjp.getSignature().toShortString();

		Long databaseSure = sure;

		String param = null;
		Object[] args = pjp.getArgs();
		for (Object object : args) {
			param+= object + " ";
			
		}
//		if(result.toString().length()>1900) {
//			result =result.toString().substring(0, 100);
//		}
		
		
		if(10<databaseSure)	{
			ApplicationLog applicatonLog = new ApplicationLog(methodName,param,result.toString(),databaseSure);
			departmentsService.setDbLog(applicatonLog);
			}
		
			
		
		
		

		

		return result;
	} 
	
	 
}
