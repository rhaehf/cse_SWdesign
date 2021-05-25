/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SystemAdministrator;

import java.util.LinkedList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jda05
 */
public class StoreListDb extends StoreManager.DbConnection {
    public StoreListDb(){
        super();
    }
    
    public DefaultTableModel selectAll(){
        String column[] = {"사업자 등록번호", "상호명", "대표자명", "사업자주소"}; // jtable의 column 내용
        DefaultTableModel model = new DefaultTableModel(null, column){
            @Override
            public boolean isCellEditable(int row, int column){ // 셀 수정 못하게 하는 부분 
                return false; 
            }
        };
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        
       try (Connection con = getConnection()) { // 데이터베이스와 연결하는 객체로 부모 클래스(DbConnection)의 메소드이다.           
            System.out.println("[StoreListDb.selectAll 연결 성공]");
            String sql = "select store_number, store_name, store_owner, store_address from store_list where store_state = 'w'"; // sql문 완성
            //System.out.println(sql);
            preparedStatement = con.prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                String [] data = new String[4];
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                model.addRow(data); // db에 튜플이 있으면 연결 리스트에 String 배열 형식으로 바로 넣어줌
                
                for(int i=0 ; i< 4; i++)
                    System.out.println("store_list DB -> data " + i + "번째 " + data[i]);                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }               
        }  
        return model;
    }
    
    public List<String[]> selectAll2(){
        PreparedStatement preparedStatement = null;
        ResultSet rs = null;
        List<String[]> listData = new LinkedList<>(); // 타입이 없는 Linkedlist로 select문 결과를 담을 dataList를 선언
        
        try (Connection con = getConnection()) { // 데이터베이스와 연결하는 객체로 부모 클래스(DbConnection)의 메소드이다.           
            System.out.println("[Database 연결 성공]");
            String sql = "select store_number, store_name, store_owner, store_address from store_list where store_state = 'w'"; // sql문 완성
            System.out.println(sql);
            preparedStatement = con.prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            
            while(rs.next()){
                String [] data = new String[4];
                data[0] = rs.getString(1);
                data[1] = rs.getString(2);
                data[2] = rs.getString(3);
                data[3] = rs.getString(4);
                listData.add(data); // db에 튜플이 있으면 연결 리스트에 String 배열 형식으로 바로 넣어줌
                
                for(int i=0 ; i< 4; i++)
                    System.out.println("store_list DB -> data " + i + "번째 " + data[i]);                
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }               
        }  
        return listData;
    }    
    
    public void storeStateUpdate(Object selectedStoreNumber){
        PreparedStatement preparedStatement = null;
        String storeNumber = selectedStoreNumber.toString(); // jtable에서 선택한 row의 store_number를 string 타입으로 변환        
        
        try (Connection con = getConnection()) { // 데이터베이스와 연결하는 객체로 부모 클래스(DbConnection)의 메소드     
            System.out.println("[StoreListDb.storeStateUpdate 연결 성공]");
            String sql = "update store_list set store_state = 'y' where store_number = ?"; // 선택한 store_number의 store_state를 y로 변경
            //System.out.println(sql);
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, storeNumber);
            
            int result = preparedStatement.executeUpdate();
            if (result > 0){ // 변경이 성공해서 영향받은 레코드 갯수를 반환하면
                JOptionPane.showMessageDialog(null, "가맹점 신청이 승인되었습니다.");
            } else {
                JOptionPane.showMessageDialog(null, "가맹점 신청이 실패하였습니다.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }               
        }  
    }
    
    public boolean modifyUpdate(String[] modifyData, String originalStoreNumber){
        PreparedStatement preparedStatement = null;
        boolean event = false;
        try (Connection con = getConnection()) { // 데이터베이스와 연결하는 객체로 부모 클래스(DbConnection)의 메소드     
            System.out.println("[StoreListDb.modifyUpdate 연결 성공]");
            String sql = "update store_list set store_number = ?, store_name = ?, store_owner = ?, store_address = ? where store_number = ?"; // 선택한 store_number의 가게 정보를 변경
            //System.out.println(sql);
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, String.valueOf(modifyData[0]));
            preparedStatement.setString(2, String.valueOf(modifyData[1]));
            preparedStatement.setString(3, String.valueOf(modifyData[2]));
            preparedStatement.setString(4, String.valueOf(modifyData[3]));
            preparedStatement.setString(5, originalStoreNumber);
            
            int result = preparedStatement.executeUpdate();
            if (result > 0){ // 변경이 성공해서 영향받은 레코드 갯수를 반환하면
                JOptionPane.showMessageDialog(null, "가맹점 정보 수정이 완료되었습니다.");           
                event = true;
            } else {
                JOptionPane.showMessageDialog(null, "가맹점 정보 수정에 실패하였습니다.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }               
        }   
        return event;
    }
    
    public void deleteRow(String storeNumber){
        PreparedStatement preparedStatement = null;
        
        try (Connection con = getConnection()){
            System.out.println("[StoreListDb.deleteRow 연결 성공]");
            String sql = "delete from store_list where store_number = ? "; // 선택한 store_number의 데이터를 삭제
            //System.out.println(sql);
            preparedStatement = con.prepareStatement(sql);
            preparedStatement.setString(1, storeNumber);
            
            int result = preparedStatement.executeUpdate();
            if (result > 0){ // 변경이 성공해서 영향받은 레코드 갯수를 반환하면
                JOptionPane.showMessageDialog(null, "가맹점 정보 삭제가 완료되었습니다.");
            } else {
                JOptionPane.showMessageDialog(null, "가맹점 정보 삭제를 실패하였습니다.");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            if (preparedStatement != null) {
                try {
                    preparedStatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }               
        }        
    
    }
    
}