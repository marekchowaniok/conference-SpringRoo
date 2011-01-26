package com.dw.roo.conference.domain;

import org.springframework.roo.addon.entity.RooEntity;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import com.dw.roo.conference.domain.Speaker;
import javax.persistence.ManyToOne;

@RooJavaBean
@RooToString
@RooEntity
public class Talk {

    @NotNull
    private String title;

    @NotNull
    @Size(max = 4000)
    private String description;

    @NotNull
    @ManyToOne
    private Speaker speaker;
}
