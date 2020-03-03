package _2_Design_Patterns._2_Structural_Patterns._2_Bridge;

import com.google.inject.AbstractModule;

public class ShapeModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Renderer.class).to(VectorRenderer.class);
    }
}
