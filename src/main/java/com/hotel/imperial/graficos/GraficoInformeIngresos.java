package com.hotel.imperial.graficos;

import com.hotel.imperial.entidades.dto.InformeIngresosDTO;
import com.hotel.imperial.util.GraficoUtil;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

import javax.swing.JFrame;

public class GraficoInformeIngresos {

    private final String titulo;
    private final List<InformeIngresosDTO> ingresosDTO;

    public GraficoInformeIngresos(String titulo, List<InformeIngresosDTO> ingresosDTO) {
        this.titulo = titulo;
        this.ingresosDTO = ingresosDTO;
    }

    public void mostrar() {
        JFrame frame = new JFrame(titulo);

        CategoryDataset dataset = createDataset(ingresosDTO);

        JFreeChart chart = ChartFactory.createLineChart(
                titulo,
                "",
                "Ingresos (S/)",
                dataset
        );

        GraficoUtil.configurarGrafico(chart, frame);
        GraficoUtil.configurarGraficoConScroll(chart, frame);
    }

    private CategoryDataset createDataset(List<InformeIngresosDTO> vistaIngresos) {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        // Ordena ascendentemente por año, y luego por mes
        Comparator<InformeIngresosDTO> comparator = Comparator
                .comparingInt(InformeIngresosDTO::getAnho)
                .thenComparingInt(InformeIngresosDTO::getMes);

        Collections.sort(vistaIngresos, comparator);

        for (InformeIngresosDTO e : vistaIngresos) {
            dataset.addValue(
                    e.getIngresos(),
                    "",
                    String.format("%02d/%d", e.getMes(), e.getAnho())
            );
        }

        return dataset;
    }

}
