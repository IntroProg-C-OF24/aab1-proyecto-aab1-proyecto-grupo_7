class Estudiante:
    def __init__(self, nombre, promedio_final):
        self.nombre = nombre
        self.promedio_final = promedio_final


def main():
    print("Ingrese la cantidad de estudiantes:")
    cantidad_estudiantes = int(input())

    estudiantes = []
    for i in range(cantidad_estudiantes):
        print(f"Ingrese el nombre del estudiante {i + 1}:")
        nombre = input()
        print(f"Ingrese el promedio final del estudiante {i + 1}:")
        promedio_final = float(input())
        estudiantes.append(Estudiante(nombre, promedio_final))

    max_promedio_1 = float('-inf')
    max_promedio_2 = float('-inf')
    mejores_egresados = [None, None]

    for estudiante in estudiantes:
        if estudiante.promedio_final > max_promedio_1:
            max_promedio_2 = max_promedio_1
            max_promedio_1 = estudiante.promedio_final
            mejores_egresados[1] = mejores_egresados[0]
            mejores_egresados[0] = estudiante
        elif estudiante.promedio_final > max_promedio_2:
            max_promedio_2 = estudiante.promedio_final
            mejores_egresados[1] = estudiante

    print("\nMejores Egresados:")
    for i in range(2):
        print("Nombre:", mejores_egresados[i].nombre)
        print("Promedio Final:", mejores_egresados[i].promedio_final)
        print("-------------")


if __name__ == "__main__":
    main()

