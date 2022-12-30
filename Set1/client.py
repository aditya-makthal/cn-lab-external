import websockets
import asyncio

async def hello():
    url = "ws://localhost:8090"
    async with websockets.connect(url) as ws:
        while True:
            name = input("Give your name : ")
            await ws.send(name)
            ans = await ws.recv()
            print(ans)
    

if __name__ == "__main__":
    asyncio.run(hello())

