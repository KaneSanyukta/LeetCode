# main.py
from ContainerWithMostWater import ContainerWithMostWater

class Main:
    @staticmethod
    def main():
        height_list = [1, 8, 6, 2, 5, 4, 8, 3, 7]
        print(ContainerWithMostWater.maxArea(height_list))

if __name__ == "__main__":
    Main.main()
