import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "KhachHangServlet", value = "/")
public class KhachHangServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<KhachHang> khangHangList = new ArrayList<>();
        khangHangList.add(new KhachHang("1","Mai Van Hoan", "1983-08-20", "Ha Noi", "mai_van_hoan.jpg"));
        khangHangList.add(new KhachHang("2","Nguyen Van Nam", "1983-08-21", "Bac Giang", "nguyen_van_nam.jpg"));
        khangHangList.add(new KhachHang("3","Nguyen Thai Hoa", "1983-08-22", "Nam Dinh", "nguyen_thai_hoa.jpg"));
        khangHangList.add(new KhachHang("4","Tran Dang Khoa", "1983-08-17", "Ha Tay", "tran_dang_khoa.jpg"));
        khangHangList.add(new KhachHang("5","Nguyen Dinh Thi", "1983-08-19", "Ha Noi", "nguyen_dinh_thi.jpg"));

        request.setAttribute("customers", khangHangList);
        request.getRequestDispatcher("/Customer.jsp").forward(request, response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}