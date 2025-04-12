/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio_02;

/**
 *
 * @author jacks
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class InvestmentPortfolio {
    
    private String userId;
    private List<Transaction> transactions;
    private Map<String, Double> fundBalances;
    
    public InvestmentPortfolio(String userId) {
        this.userId = userId;
        this.transactions = new ArrayList<>();
        this.fundBalances = new HashMap<>();
    }
    //Se creó una funcion Validaciones porque se repetia este codigo
    public void Validaciones(String fundCode, double amount){
        // Validaciones para transacción BUY
        if (fundCode == null || fundCode.isEmpty()) {
            throw new IllegalArgumentException("El código del fondo no puede estar vacío");
        }
        
        if (amount <= 0) {
            throw new IllegalArgumentException("El monto debe ser mayor a cero");
        }
        // Verificar si el fondo existe
        if (!isFundValid(fundCode)) {
            throw new IllegalArgumentException("El fondo no existe: " + fundCode);
        }
    }
    
    //Creacion de la funcion Registrar porque se repetia, solo se agrego un if para validar el tipo de transaccion
    public void RegistrarTransaccion(Transaction transaccion, String fundCode, double amount, double currentBalance){
        transactions.add(transaccion);
        if (transaccion.getType() == "BUY") {
            // Actualizar el balance del fondo
            if (fundBalances.containsKey(fundCode)) {
                
                fundBalances.put(fundCode, currentBalance + amount);
            } else {
                fundBalances.put(fundCode, amount);
            }
        } else {
            // Actualizar el balance del fondo
            fundBalances.put(fundCode, currentBalance - amount);
            
        }

        // Registrar la transacción en la base de datos
        saveTransactionToDatabase(transaccion);
        
        // Notificar al usuario
        sendNotificationToUser("Se ha realizado una compra por $" + amount + " en el fondo " + fundCode);
        
        System.out.println("Transacción de compra procesada exitosamente. ID: " + transaccion.getId());
    }
    
    public void processBuyTransaction(String fundCode, double amount) {
        Validaciones(fundCode, amount);
        Double currentBalance = fundBalances.getOrDefault(fundCode, 0.0);
        // Crear la transacción BUY
        String transactionId = UUID.randomUUID().toString();
        Date transactionDate = new Date();
        Transaction buyTransaction = new Transaction(
                transactionId, 
                userId, 
                fundCode, 
                "BUY", 
                amount, 
                transactionDate);
        
        RegistrarTransaccion(buyTransaction,fundCode,amount,currentBalance);
    }
    
    public void processSellTransaction(String fundCode, double amount) {
        
        Validaciones(fundCode, amount);
        
        // Verificar fondos suficientes
        Double currentBalance = fundBalances.getOrDefault(fundCode, 0.0);
        if (currentBalance < amount) {
            throw new IllegalArgumentException("Saldo insuficiente. Balance actual: " + currentBalance);
        }
        
        // Crear la transacción SELL
        String transactionId = UUID.randomUUID().toString();
        Date transactionDate = new Date();
        Transaction sellTransaction = new Transaction(
                transactionId, 
                userId, 
                fundCode, 
                "SELL", 
                amount, 
                transactionDate);
        
        RegistrarTransaccion(sellTransaction,fundCode,amount, currentBalance);
    }
    
    private boolean isFundValid(String fundCode) {
        // Simulación de validación de fondo
        return fundCode.startsWith("FUND");
    }
    
    private void saveTransactionToDatabase(Transaction transaction) {
        // Simulación de guardado en base de datos
        System.out.println("Guardando transacción en la base de datos: " + transaction.getId());
    }
    
    private void sendNotificationToUser(String message) {
        // Simulación de envío de notificación
        System.out.println("Notificación para usuario " + userId + ": " + message);
    }
    
    public List<Transaction> getTransactions() {
        return transactions;
    }
    
    public Map<String, Double> getFundBalances() {
        return fundBalances;
    }
    
}
