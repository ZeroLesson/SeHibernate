import java.sql.SQLException;

import com.example.db.dao.RoomDAO;
import com.example.db.model.Room;

public class Test {
	public static void main(String[] args) throws SQLException {
		RoomDAO r = new RoomDAO();
		for (Room rs : r.getAllRoom())
			System.out.println(rs);
	}
}
