/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;

import Model.TheMuon;

public interface TheMuonService {
	  
	  public List<TheMuon> getList();
	  
	  public int createOrUpdate(TheMuon theMuon);
	  
	  public int delete (TheMuon theMuon);
}

