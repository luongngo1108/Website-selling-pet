package banThuCung.userService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import banThuCung.Entities.Payment;

@Service
public interface IPaymentService {
	@Autowired
	public List<Payment> getDataPayment();
}
