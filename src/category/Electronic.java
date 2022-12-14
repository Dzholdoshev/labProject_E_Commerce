package category;



import java.time.LocalDateTime;
import java.util.UUID;

public class Electronic extends Category{

    public Electronic(Integer id, String name) {
        super(id, name);
    }

    @Override
    public LocalDateTime findDeliveryDueDate() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.plusDays(4L);
    }

    @Override
    public String generateCategoryCode() {

        return "EL-" + getId().toString().substring(0,8);
    }
}
