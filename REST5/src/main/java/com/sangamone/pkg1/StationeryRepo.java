package com.sangamone.pkg1;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface StationeryRepo extends JpaRepository<StationeryEntity, Integer>{
	
	StationeryController sc1=new StationeryController();
	
	@Query(value="select distinct location from sales",nativeQuery=true)
	public ArrayList<String> getDistinctLocations();
	
	@Query(value="select sum(salesamt)from sales where location like:loc",nativeQuery=true)
	public int getSalesAmt1(@Param (value="loc") String loc);
	
	@Query(value="select sum(salesamt) from sales where location like 'Saket'",nativeQuery=true)
	public int getSalesAmt2();   //not used

	@Query(value="select sum(salesamt) from sales where yearmonth like '202401'",nativeQuery = true)
	public int getSalesAmt3();
 
    @Query(value = "select sum(salesamt) from sales where yearmonth like '202402'",nativeQuery = true)
	public int getSalesAmt4();

}
