package br.com.checklist;

import br.com.checklist.entity.Veiculo;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/veiculo")
public class VeiculoResource {
    @Inject
    EntityManager entityManager;

    @POST 
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Veiculo criaVeiculo(Veiculo veiculo) {
        System.out.println("Veículo criado com sucesso: " + veiculo);

        entityManager.persist(veiculo);
        System.out.println("Veículo criado com sucesso: " + veiculo);
        return veiculo;
    }
}
