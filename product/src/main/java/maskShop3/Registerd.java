
package maskShop3;

public class Registerd extends AbstractEvent {

    private Long id;
    private Long productId;
    private String productName;
    private Integer invQty; // 0803 lys 추가

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // 0803 lys 추가
    public Integer getInvQty() {
        return invQty;
    }
    // 0803 lys 추가
    public void setInvQty(Integer invQty) {
        this.invQty = invQty;
    }
}
