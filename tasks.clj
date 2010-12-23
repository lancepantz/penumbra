(deftask text "Render hello world"
  (bake (:use example.opengl.text) []
        (start)))

(deftask gears "Render a Rotating gear"
  (bake (:use example.opengl.gears) []
        (start)))

(deftask sierpinski "Render a sierpinski triangle"
  (bake (:use example.opengl.sierpinski) []
        (start)))

(deftask rtt "Render to texture demo"
  (bake (:use example.opengl.render-to-texture) []
        (start)))

(deftask marble "Render a 3D marble teapot"
  (bake (:use example.opengl.marble) []
        (start)))

(deftask async "Run async demonstration"
  (bake (:use example.opengl.async) []
        (start)))

(deftask tetris "Play tetris"
  (bake (:use example.game.tetris) []
        (start)))

(deftask asteroids "Play asteroids"
  (bake (:use example.game.asteroids) []
        (start)))

(deftask pong "Play pong"
  (bake (:use example.game.pong) []
        (start)))

(deftask mandelbrot "Render a Mandelbrot set"
  (bake (:use example.gpgpu.mandelbrot) []
        (start)))

(deftask convolution "Render a convolution pattern"
  (bake (:use example.gpgpu.convolution) []
        (start)))

(deftask convolution ""
  (bake (:use example.gpgpu.convolution) []
        (start)))

(deftask brian "Brian's brain cellular automaton"
  (bake (:use example.gpgpu.brians-brain) []
        (start)))

(deftask fluid "Fluid mouse effect demo"
  (bake (:use example.gpgpu.fluid) []
        (start)))