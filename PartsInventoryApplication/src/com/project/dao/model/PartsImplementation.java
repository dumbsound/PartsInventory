package com.project.dao.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.project.DatabaseConnection.DatabaseConnection;
import com.project.model.Parts;

public class PartsImplementation extends DatabaseConnection implements PartsMethodInterface {

	private PreparedStatement stmt = null;
	private ResultSet rs = null;

	public void addParts(Parts parts) {

		String addPartsQuery = "insert into lenovoparts values(?,?,?,?);";

		getConnection();

		try {
			stmt = con.prepareStatement(addPartsQuery);
			stmt.setString(1, parts.getDateReceived());
			stmt.setString(2, parts.getProductName());
			stmt.setString(3, parts.getSku());
			stmt.setString(4, parts.getSerialNos());

			stmt.executeUpdate();

			System.out.println("Part " + parts.getSku() + " has been added to the table.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeConnection();

	}

	public Parts getParts(String sku) {

		String getPartsQuery = "select * from lenovoparts where sku=?";
		getConnection();

		try {
			stmt = con.prepareStatement(getPartsQuery);
			stmt.setString(1, sku);
			stmt.executeQuery();
			rs = stmt.getResultSet();
			while (rs.next()) {
				Parts parts = new Parts();
				parts.setDateReceived(rs.getString("Date_Received"));
				parts.setProductName(rs.getString("Product_Name"));
				parts.setSerialNos(rs.getString("Serial_Nos"));
				parts.setSku(rs.getString("sku"));
				return parts;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;

	}

	public List<Parts> getAllParts() {
		ArrayList<Parts> partsList = new ArrayList<Parts>();
		String getAllPartsQuery = "select * from lenovoparts";

		getConnection();

		try {
			stmt = con.prepareStatement(getAllPartsQuery);
			stmt.executeQuery();
			rs = stmt.getResultSet();
			while (rs.next()) {
				Parts parts = new Parts();
				parts.setDateReceived(rs.getString("Date_Received"));
				parts.setProductName(rs.getString("Product_Name"));
				parts.setSerialNos(rs.getString("Serial_Nos"));
				parts.setSku(rs.getString("sku"));
				partsList.add(parts);
			}

			System.out.println("Printed");
			System.out.println("There are a total of " + partsList.size() + " Laptop");

			return partsList;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return partsList;

	}

	public void editParts(Parts parts) {

		String editPartsQuery = "Update where Date_Received=?, Product_Name=?,Serial_Number=? where SKU=?;";

		getConnection();

		try {
			stmt = con.prepareStatement(editPartsQuery);
			stmt.setString(1, parts.getDateReceived());
			stmt.setString(2, parts.getProductName());
			stmt.setString(3, parts.getSerialNos());
			stmt.setString(4, parts.getSku());

			stmt.executeQuery();
			int result = stmt.executeUpdate();
			if (result == 0) {
				System.out.println("Parts SKU" + parts.getSku() + " does not exist in the table");
			} else {
				System.out.println("Parts SKU" + parts.getSku() + " has been updated from table");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeConnection();

	}

	@Override
	public void removeParts(String sku) {

		String removePartsQuery = "Delete lenovoparts where sku=?";
		getConnection();

		try {
			stmt = con.prepareStatement(removePartsQuery);
			stmt.setString(1, sku);
			int result = stmt.executeUpdate();

			if (result == 0) {
				System.out.println("SKU number" + sku + " does not exist in the table");
			} else {
				System.out.println("SKU number" + sku + " has been deleted from table");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		closeConnection();
	}
}
