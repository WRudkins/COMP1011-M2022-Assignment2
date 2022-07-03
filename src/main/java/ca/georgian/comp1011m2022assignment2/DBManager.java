package ca.georgian.comp1011m2022assignment2;

import javafx.scene.chart.XYChart;

import java.sql.*;
import java.util.ArrayList;

/* Singleton */
public class DBManager
{
    /********************* SINGLETON SECTION *****************************/
    // Step 1. private static instance member variable
    private static DBManager m_instance = null;
    // Step 2. make the default constructor private
    private DBManager() {}
    // Step 3. create a public static entry point / instance method
    public static DBManager Instance()
    {
        // Step 4. Check if the private instance member variable is null
        if(m_instance == null)
        {
            // Step 5. Instantiate a new DBManager instance
            m_instance = new DBManager();
        }
        return m_instance;
    }
    /*********************************************************************/

    // private instance member variables
    private String m_user = "root";
    private String m_password = "";
    private String m_connectURL = "jdbc:mysql://localhost:3306/world";

    /**
     * This method reads the vectors table from the MySQL database
     * and returns an ArrayList of Vector2D type
     * @return
     */
    public ArrayList<worldDB> readCountryTable()
    {
        // Instantiates an ArrayList collection of type Student
        ArrayList<worldDB> worldDBs = new ArrayList<worldDB>();

        String sql = "SELECT country.Code, Name, Continent, Region, Population FROM country GROUP BY country.Code";

        try
        (
        Connection connection = DriverManager.getConnection(m_connectURL, m_user, m_password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        )
        {
            // while there is another record...loop
            while(resultSet.next())
            {
                // deserialize (decode) the data from database table
                String Code = resultSet.getString("Code");
                String Name = resultSet.getString("Name");
                String Continent = resultSet.getString("Continent");
                String Region = resultSet.getString("Region");
                int Population = resultSet.getInt("Population");

                worldDBs.add( new worldDB(Code, Name, Continent, Region, Population));
            }
        }
        catch(Exception exception)
        {
            exception.printStackTrace();
        }

        return worldDBs;
    }
    public XYChart.Series<String, Integer> getChartData()
    {
        XYChart.Series<String, Integer> populations = new XYChart.Series<>();
        populations.setName("Country Population");

        ArrayList<worldDB> worldDBs = readCountryTable();

        for(var Name : worldDBs){
            var chartData = new XYChart.Data<>(Name.getName(), Name.getPopulation());
            populations.getData().add(chartData);
        }
        return populations;
    }

}
