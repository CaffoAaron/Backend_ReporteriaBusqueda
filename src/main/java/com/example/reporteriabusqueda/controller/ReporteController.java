package com.example.reporteriabusqueda.controller;

import com.example.reporteriabusqueda.Reporte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/api")
public class ReporteController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/Prueba")
    public String hola() {

        return "has hecho un peticion get";

    }

    @GetMapping("/reporte")
    public List<Reporte> getAllReporte(){
        String sql = "SELECT  [NU_DOC],[NU_DIA_ATE],[FE_EMI],[CO_GRU],[DE_ASU],[ES_DOC_EMI],[CO_USE_CRE], [CO_USE_MOD],[DE_DOC_SIG] FROM [IDOSGD].[TDTV_REMITOS]";
        System.out.println(sql);
        List<Reporte> reportes = this.jdbcTemplate.query(sql, new Object[]{}, new RowMapper<Reporte>() {
            public Reporte mapRow(ResultSet rs, int i) throws SQLException {
                Reporte s = new Reporte();
                s.setNU_DOC(rs.getString("NU_DOC"));
                s.setCO_GRU(rs.getString("CO_GRU"));
                s.setDE_ASU(rs.getString("DE_ASU"));
                s.setES_DOC_EMI(rs.getString("ES_DOC_EMI"));
                s.setCO_USE_CRE(rs.getString("CO_USE_CRE"));
                s.setCO_USE_MOD(rs.getString("CO_USE_MOD"));
                s.setDE_DOC_SIG(rs.getString("DE_DOC_SIG"));
                s.setFE_EMI(rs.getString("FE_EMI"));
                s.setNU_DIA_ATE(rs.getString("NU_DIA_ATE"));

                return s;
            }
        });
        System.out.println(reportes);
        return reportes;
    }
    @GetMapping("/reporte/{nombre}")
    public List<Reporte> getAllReporteByAsu(@PathVariable(name = "nombre") String nombre){
        String sql = "SELECT  [NU_DOC],[NU_DIA_ATE],[FE_EMI],[CO_GRU],[DE_ASU],[ES_DOC_EMI],[CO_USE_CRE], [CO_USE_MOD],[DE_DOC_SIG] FROM [IDOSGD].[TDTV_REMITOS] WHERE [DE_ASU]='" + nombre + "'";
        System.out.println(nombre);
        System.out.println(sql);
        List<Reporte> reportes = this.jdbcTemplate.query(sql, new Object[]{}, new RowMapper<Reporte>() {
            public Reporte mapRow(ResultSet rs, int i) throws SQLException {
                Reporte s = new Reporte();
                s.setNU_DOC(rs.getString("NU_DOC"));
                s.setCO_GRU(rs.getString("CO_GRU"));
                s.setDE_ASU(rs.getString("DE_ASU"));
                s.setES_DOC_EMI(rs.getString("ES_DOC_EMI"));
                s.setCO_USE_CRE(rs.getString("CO_USE_CRE"));
                s.setCO_USE_MOD(rs.getString("CO_USE_MOD"));
                s.setDE_DOC_SIG(rs.getString("DE_DOC_SIG"));
                s.setFE_EMI(rs.getString("FE_EMI"));
                s.setNU_DIA_ATE(rs.getString("NU_DIA_ATE"));
                return s;
            }
        });

        return reportes;
    }
//    public Page<UserChefResource> getAllUserChef(Pageable pageable) {
//        Page<UserChef> userChef = userChefService.getAllUserChef(pageable);
//        List<UserChefResource> resource = userChef
//                .getContent()
//                .stream()
//                .map(this::convertToResource)
//                .collect(Collectors.toList());
//        return new PageImpl<>(resource, pageable, resource.size());
//    }

}
