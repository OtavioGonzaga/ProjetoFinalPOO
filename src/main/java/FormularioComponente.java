// Otavio Luiz Gonzaga - RA: a2648920

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author otavio
 */
public interface FormularioComponente<T> {
    void limparFormulario();

    void setarDados(T dado) throws Exception;
}
