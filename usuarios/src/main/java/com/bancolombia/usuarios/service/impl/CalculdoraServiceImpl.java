package com.bancolombia.usuarios.service.impl;

import com.bancolombia.usuarios.service.ICalculadoraService;
import org.springframework.stereotype.Service;

@Service
public class CalculdoraServiceImpl implements ICalculadoraService {

    @Override
    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }
}