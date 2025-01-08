// package Controller;

// import Model.*;

// import java.sql.*;
// import java.util.*;

// public class LoginCheck {
//     public static List<User> showUser() {
//         List<User> listUser = new ArrayList<>();

//         String query = "SELECT * FROM user_id";
        
//         try {
//             PreparedStatement st = ConnectionManager.getConnection().
//                                                     prepareStatement(query);
//             ResultSet rs = st.executeQuery();
//             while (rs.next()) {
//                 Mahasiswa m = new Mahasiswa();
//                 m.setNama(rs.getString("nama"));
//                 m.setNim(rs.getString("nim"));
//                 listMahasiswa.add(m);
//             }
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
        
//         return listMahasiswa;
//     }
// }

