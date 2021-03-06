package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("product no 1");
        Product product2 = new Product("product no 2");
        Product product3 = new Product("product no 3");
        Item item1 = new Item(new BigDecimal(10.5), 2);
        Item item2 = new Item(new BigDecimal(3.3), 1);
        Item item3 = new Item(new BigDecimal(13.5), 5);
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        product1.getItems().add(item1);
        product2.getItems().add(item2);
        product3.getItems().add(item3);
        Invoice invoice = new Invoice("FV_1233/03");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        //Then
        Assert.assertNotEquals(0, id);
        //CleanUp
        invoiceDao.deleteById(id);
    }
}
