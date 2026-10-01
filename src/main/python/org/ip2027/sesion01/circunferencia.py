import math
def main(radio= 4.5):
    radio= 4.5
    
    diametro= 2 * radio
    perimetro= 2 * math.pi * radio  
    area= math.pi * (radio ** 2)
    
    area_esfera= 4 * math.pi * ( radio ** 2)
    volumen_esfera = (4 / 3) * math.pi * (radio ** 3)
    
    
    print(f"Radio = {radio:.3f}")
    print(f"Diametro de la circunferencia = {diametro:.3f}")
    print(f"Perimetro de la circunferencia = {perimetro:.3f}")
    print(f"Area de la circunferencia = {area:.3f}")
    print(f"Area de la esfera = {area_esfera:.3f}")
    print(f"Volumen de la esfera = {volumen_esfera:.3f}")

if __name__ == "__main__":
    main()