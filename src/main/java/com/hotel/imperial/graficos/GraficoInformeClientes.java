package com.hotel.imperial.graficos;

import com.hotel.imperial.entidades.dto.InformeReservasDTO;
import com.hotel.imperial.util.GraficoUtil;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

public class GraficoInformeClientes {

    private final String titulo;
    private final List<InformeReservasDTO> clientesDTO;

    public GraficoInformeClientes(String titulo, List<InformeReservasDTO> clientesDTO) {
        this.titulo = titulo;
        this.clientesDTO = clientesDTO;
    }

    public void mostrar() {
        JFrame frame = new JFrame(titulo);

        CategoryDataset dataset = createDataset(clientesDTO);

        JFreeChart chart = ChartFactory.createLineChart(
                titulo,
                "",
                "Reservas",
                dataset
        );

        GraficoUtil.configurarGrafico(chart, frame);
        GraficoUtil.configurarGraficoConScroll(chart, frame);
    }

    private CategoryDataset createDataset(List<InformeReservasDTO> vistaClientes) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Ordena ascendentemente por año, y luego por mes
        Comparator<InformeReservasDTO> comparator = Comparator
                .comparingInt(InformeReservasDTO::getAnho)
                .thenComparingInt(InformeReservasDTO::getMes);

        Collections.sort(vistaClientes, comparator);

        for (InformeReservasDTO e : vistaClientes) {
            dataset.addValue(
                    e.getTotalReservas(),
                    "",
                    String.format("%02d/%d", e.getMes(), e.getAnho())
            );
        }

        return dataset;
    }

}
