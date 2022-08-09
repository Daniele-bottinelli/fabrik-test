package it.omicron.service;

import it.omicron.dto.TransactionDto;
import it.omicron.entities.Transaction;
import it.omicron.repository.TransactionRepository;
import it.omicron.rest.TransactionRestConnector;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TransactionServiceImpl implements TransactionService{

    @Autowired
    TransactionRepository transactionRepository;

    @Autowired
    private TransactionRestConnector transactionRestConnector;

    @Override
    public TransactionDto getTransaction(Long accountId,String fromDate, String toDate){
        return transactionRestConnector.getTransaction(accountId,fromDate,toDate);
    }

    private TransactionDto saldoMap(Transaction transaction){
        ModelMapper modelMapper = new ModelMapper();
        return modelMapper.map(transaction, TransactionDto.class);
    }
}
