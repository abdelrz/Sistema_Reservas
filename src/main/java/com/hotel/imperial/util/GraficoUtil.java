package com.hotel.imperial.util;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.renderer.category.LineAndShapeRenderer;

public class GraficoUtil {

    public static void configurarGrafico(JFreeChart chart, JFrame frame) {
        String rutaIcono = "/images/icono.png";
        VentanaUtil.configurarIcono(frame, rutaIcono);

        // Personalización del gráfico
        chart.setBackgroundPaint(Color.WHITE); // Cambia el color de fondo del gráfico
        CategoryPlot plot = (CategoryPlot) chart.getPlot();
        plot.setBackgroundPaint(Color.WHITE); // Cambia el color de fondo del área del gráfico
        plot.setRangeGridlinePaint(Color.GRAY); // Cambia el color de las líneas de la cuadrícula del eje y

        // Cambiar el estilo de línea
        LineAndShapeRenderer renderer = (LineAndShapeRenderer) plot.getRenderer();
        renderer.setSeriesStroke(0, new BasicStroke(2.0f)); // Cambia el grosor de la línea
        renderer.setSeriesPaint(0, Color.GREEN); // Cambia el color de la línea

        // Cambiar la fuente del texto en el gráfico
        CategoryAxis domainAxis = plot.getDomainAxis();
        domainAxis.setTickLabelFont(new Font("Arial", Font.PLAIN, 12)); // Cambia la fuente del texto en el eje x
        domainAxis.setLabelFont(new Font("Arial", Font.BOLD, 16)); // Cambia la fuente del texto de la etiqueta del eje x

        // Cambiar la fuente del texto en el eje y
        NumberAxis rangeAxis = (NumberAxis) plot.getRangeAxis();
        rangeAxis.setTickLabelFont(new Font("Arial", Font.PLAIN, 12)); // Cambia la fuente del texto en el eje y
        rangeAxis.setLabelFont(new Font("Arial", Font.BOLD, 16)); // Cambia la fuente del texto de la etiqueta del eje y

        // Ocultar legenda
        chart.getLegend().setVisible(false);

        // Cambiar la fuente y el color del título del gráfico
        chart.getTitle().setFont(new Font("Arial", Font.PLAIN, 18));
        chart.getTitle().setPaint(Color.WHITE);

    }

    public static void configurarGraficoConScroll(JFreeChart chart, JFrame frame) {
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(900, 450));

        // Deshabilitar el zoom
        chartPanel.setDomainZoomable(false);
        chartPanel.setRangeZoomable(false);

        JScrollPane scrollPane = new JScrollPane(chartPanel, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setPreferredSize(new Dimension(900, 500));
        frame.setContentPane(scrollPane);

        frame.pack();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
    }
}
