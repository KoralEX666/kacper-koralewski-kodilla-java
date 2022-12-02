package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;
    @Autowired
    private ItemDao itemDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("DJI");
        Product product2 = new Product("Avata");
        Product product3 = new Product("FPV");

        Item item = new Item(product, new BigDecimal(15), 10, new BigDecimal(300));
        Item item2 = new Item(product2, new BigDecimal(20), 5, new BigDecimal(100));
        Item item3 = new Item(product3, new BigDecimal(25), 8, new BigDecimal(200));

        Invoice invoice = new Invoice("5");

        /*productDao.save(product);
        productDao.save(product2);
        productDao.save(product3);*/

        item.setProduct(product);
        item2.setProduct(product2);
        item3.setProduct(product3);

        item.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);

        product.getItems().add(item);
        product2.getItems().add(item2);
        product3.getItems().add(item3);

        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When

        invoiceDao.save(invoice);


        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);
        invoiceDao.deleteAll();
    }
}
