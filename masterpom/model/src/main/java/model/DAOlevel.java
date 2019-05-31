package model;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class DAOlevel{
	
	
	static DBConnection connect= new DBConnection();
	private char[][] scenetest = new char[23][50];
	
	public DAOlevel() {
		
		this.scenetest=this.niveau();
	}
	
	

	private char[][] niveau(){
		
		String strCurrentline= null;
		//int j=0;
		char[][] scenetest = new char[50][23];
		int j=0;
	       try {
               final String sql= "{call prolevel3()}";
               final CallableStatement call = connect.getConnection().prepareCall(sql);
               call.execute();
               final ResultSet resultSet = call.getResultSet(); 
               while(resultSet.next()) {
                   strCurrentline= resultSet.getString("map");
            	   for (int i=0;i<50;i++) {
                    	 scenetest[i][j]=strCurrentline.charAt(i);
               }  
            	   j++;
               }
                    
                        
         //j++;
                         }       
        catch (final SQLException e) {
               e.printStackTrace();
        }
		
		return scenetest;
}



	public char[][] getScenetest() {
		return scenetest;
	}



	public void setScenetest(char[][] scenetest) {
		this.scenetest = scenetest;
	}
	
}

