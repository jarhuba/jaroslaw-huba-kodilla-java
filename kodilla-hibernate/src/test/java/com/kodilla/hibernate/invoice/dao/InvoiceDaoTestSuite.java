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
    InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave() {
        //Given
        Product product1 = new Product("marchewka");
        Product product2 = new Product("TV");
        Product product3 = new Product("cement");

        Item food = new Item(product1, BigDecimal.valueOf(11.0), 1);
        Item electronics = new Item(product2, BigDecimal.valueOf(22.0), 2);
        Item materials = new Item(product3, BigDecimal.valueOf(33.0), 3);

        food.setProduct(product1);
        electronics.setProduct(product2);
        materials.setProduct(product3);

        Invoice initialInvoice = new Invoice("001");
        initialInvoice.getItems().add(food);
        initialInvoice.getItems().add(electronics);
        initialInvoice.getItems().add(materials);

        food.setInvoice(initialInvoice);
        electronics.setInvoice(initialInvoice);
        materials.setInvoice(initialInvoice);

        //When
        invoiceDao.save(initialInvoice);
        int invoiceId = initialInvoice.getId();

        //Then
        Assert.assertNotEquals(0, invoiceId);

        //CleanUp
        invoiceDao.delete(invoiceId);
    }
}
